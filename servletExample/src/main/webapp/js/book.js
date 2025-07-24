$(".inputData").on({
    focusout : function(){
        if($(this).val().replace(/\s/g, "") === ""){
            $(this).next().html($(this).prev().html() + " 필수항목입니다");
            return;
        }
    },
    focusin : function(){
        $(this).next().html("");
    }
});

$("#btn").on("click", function () {
    let isValid = true;

    $(".inputData").each(function () {
        if ($(this).val().replace(/\s/g, "") === "") {
            $(this).next().html($(this).prev().html() + " 필수항목입니다");
            isValid = false;
        }
    });

    if (isValid) {
        $("#bookForm").attr({
            "action": "/servletExample/bookInput",
            "method": "post"
        });
        $("#bookForm").submit();
    }
});