<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>页面</title>
<body>
<form action="/calculate" method="post" >
    numberA:<input type="text" size="30" name="numberA"><br>
    numberB:<input type="text" size="30" name="numberB"><br>
    <select class="form-control" name="operation" id="state">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select><input type="submit" value="comfirm"><br>
    结果:<input type="text" value="${(result)!""}" readonly>
</form>
</body>
</html>