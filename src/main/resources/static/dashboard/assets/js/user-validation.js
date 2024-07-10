page.dialogs.elements.formCreate.validate({
    rules: {
        usernameCre: {
            required: true,
            maxlength: 20,
            minlength: 6
        },
        passwordCre: {
            required: true
        },
        roleCre: {
            required: true,
        }
    },
    messages: {
        usernameCre: {
            required: 'Tên đăng nhập là bắt buộc',
            maxlength: 'Tên tối đa ${0} ký tự',
            minlength: 'Tên tối thiểu ${0} ký tự'
        },
        passwordCre: {
            required: 'Password là bắt buộc'
        },
        roleCre: {
            required: 'Role là bắt buộc'
        }
    },
    errorLabelContainer: "#modalCreate .error-area",
    errorPlacement: function (error, element) {
        error.appendTo("#modalCreate .error-area");
    },
    showErrors: function (errorMap, errorList) {
        if (this.numberOfInvalids() > 0) {
            page.dialogs.elements.errorAreaCreate.removeClass("hide").addClass("show");
        } else {
            page.dialogs.elements.errorAreaCreate.removeClass("show").addClass("hide").empty();
            $("#formCreate input.error").removeClass("error");
        }
        this.defaultShowErrors();
    },
    submitHandler: function () {
        page.dialogs.commands.create();
    }
})


