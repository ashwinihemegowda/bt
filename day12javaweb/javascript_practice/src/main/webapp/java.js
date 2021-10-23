function warn()
    {

<!--    document.write("This is warning message!");-->
    alert("This is warning message!");
    }
    function getconfirm()
    {
    var a=confirm("Do you want to continue");
    if(a==true)
    {
    document.write("User wants to continue");
    }
    else
    {
    document.write("User does not wants to continue");
    }