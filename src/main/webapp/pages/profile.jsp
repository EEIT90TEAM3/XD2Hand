<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html lang="en">
<head>
    <title>个人信息</title>
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" type="text/css" href="/css/theme.css">
    <link rel="stylesheet" href="/css/normalize.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Changa+One">
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/responsive.css">

    <script src="/js/bootstrap.js" type="text/javascript"></script>
    <script src="/js/jquery.min.js" type="text/javascript"></script>

</head>
<body>

<header>
    <a href="MainPage.jsp" id="logo">
        <h1> XD2HandBookStore</h1>
    </a>
    <div class="login">
        <ul class="login-option">
            <li><a href="/userManage/loginPage">Login</a></li>
            <li><a href="/userManage/registerPage">Register</a></li>
            <li><a href="/userManage/editInfoPage">个人信息页</a></li>
        </ul>
    </div>

    <nav>
        <ul>
            <li><a href="#">HOME</a></li>
            <li><a href="#">BLOG</a></li>
            <li><a href="#">SHOP</a></li>
            <li><a href="#">FAQ</a></li>
            <li><a href="#">CONTACT</a></li>
            <li><a href="/userAction/publishBookPage">UPLOADBOOK</a></li>
        </ul>
    </nav>
</header>


<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <ul class="nav pull-right">

                <li id="fat-menu" class="dropdown">
                    <a href="#" id="drop3" role="button" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="icon-user"></i>Susan
                        <i class="icon-caret-down"></i>
                    </a>

                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="#">Signed in as Susan</a></li>
                        <li class="divider"></li>
                        <li><a tabindex="-1" href="#">Your profile</a></li>
                        <li><a tabindex="-1" href="#">Help</a></li>
                        <li class="divider"></li>
                        <li><a tabindex="-1" href="#">Settings</a></li>
                        <li><a tabindex="-1" href="#">Sign out</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>

<div>
    <ul>
        <li><a href="#">Profile</a></li>
        <li><a href="#">Account</a></li>
        <li><a href="#">History Record</a></li>
        <li><a href="#">Class Annoucement</a></li>
    </ul>

</div>


<div class="container-fluid">


    <div class="span3">
        <div class="sidebar-nav">
            <div class="nav-header"><i class="icon-dashboard"></i><img src="#"></div>
            <div>Susan</div>
            <div>Harrington</div>
        </div>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="#">Books publised</a></li>
            <li><a href="#">Recommended books</a></li>
            <li><a href="#">Teachers recommended books</a></li>
        </ul>
    </div>


    <div class="span9">
        <h1 class="page title">Public profile</h1>
        <div class="page images">
            <div class="profile picture">Profile picture</div>
            <div class="profile info">
                <div class="profile-img"><img src="#"></div>
                <div class="upload-img">
                    <div>upload new pictures</div>
                    <div>You can also drag or drop a picture from your computer</div>
                </div>
            </div>
            <form id="tab" action="#">
                <label>User</label>
                <input type="text" value="Susan" name="user" class="input-xlarge">
                <label>First Name</label>
                <input type="text" value="Susan" name="firstName" class="input-xlarge">
                <label>Last Name</label>
                <input type="text" value="Harrington" name="lastName" class="input-xlarge">
                <label>Email</label>
                <input type="text" value="susan_harrington@email.com" class="input-xlarge">
                <input type="submit" value="submit">
            </form>
        </div>
        <h1 class="page title">Update password</h1>
        <label>Previous password</label>
        <input type="password" value="1212" name="pre_password" class="input-xlarge" form="tab">
        <label>New Password</label>
        <input type="password" value="1212" name="new_password" class="input-xlarge" form="tab">

    </div>


</div>

</body>
</html>
