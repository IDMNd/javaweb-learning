<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>相应不同类型的文件</title>
  <style>
    ul li {
      list-style: none;
      float: left;
      margin-left: 40px;
    }
  ul li a {
    padding: 20px  50px;
    height: 40px;
    background: #0080FF;
    color: white;
    box-sizing: border-box;
    margin-right: 10px;
    font-size: 16px;
    text-decoration: none;
  }
  </style>
</head>
<body>
<h1><%= "设置 Content-Type"%></h1>
  <h2><%= "根据不同的参数类型返回不同的资源"%></h2>
<br/>
<br/>
<ul>
  <li>
    <a href="/res?type=img">返回图片</a>
  </li>
  <li>
    <a href="/res?type=pdf">返回pdf</a>
  </li>
  <li>
    <a href="/res?type=txt">返回文本</a>
  </li>
</ul>

<a href="download?filename=image.jpg">壁纸</a>
</body>
</html>


