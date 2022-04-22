var main = {
    init : function () {
        var _this = this;

        $('#btn-save').on('click', function () {
            _this.save();
        });

        $('#btn-update').on('click', function () {
            _this.update();
        });

        $('#btn-delete').on('click', function () {
            _this.delete();
        });

        $('#btn-regist').on('click', function () {
            _this.check_email();
            _this.regist();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('reg succ');
            window.location.href = '/';
        }).fail(function (error) {
            alert(error);
        });
     },

       update : function () {

            var data = {
                title: $('#title').val(),
                content: $('#content').val()
            };

            var id = $('#id').val()

            $.ajax({
                type: 'PUT',
                url: '/api/v1/posts/'+id,
                dataType: 'json',
                contentType:'application/json; charset=utf-8',
                data: JSON.stringify(data)
            }).done(function() {
                alert('complete.');
                window.location.href = '/';
            }).fail(function (error) {
                alert(JSON.stringify(error));
            });
       },

      delete : function () {
            var id = $('#id').val()

            $.ajax({
                type: 'DELETE',
                url: '/api/v1/posts/'+id,
                dataType: 'json',
                contentType:'application/json; charset=utf-8',
            }).done(function() {
                alert('삭제성공.');
                window.location.href = '/';
            }).fail(function (error) {
                alert(JSON.stringify(error));
            });
       },
      regist : function () {

        var data = {
            name: $('#name').val(),
            password: $('#password').val(),
            role: $('#role').val(),
            email: $('#email').val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/member/regist',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('가입 성공');
            window.location.href = '/';
        }).fail(function (error) {
            alert(error);
        });
     },

    check_email : function () {
        var password = $('#password').val()
        var pw_reg = /^(?=.*[a-zA-Z])((?=.*\d)(?=.*\W)).{8,16}$/
        if (!pw_reg.test(password)) {
            alert("비밀번호는 8~16자리, 알파벳, 숫자, 특수기호를 반드시 포함해야 합니다");
        }
     }

};

main.init();