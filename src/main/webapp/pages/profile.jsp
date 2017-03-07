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
    <link rel="stylesheet" type="text/css" href="/css/font-awesome.css">

    <script src="/js/bootstrap.js" type="text/javascript"></script>
    <script src="/js/jquery.min.js" type="text/javascript"></script>


    <!--[if lt IE 8]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
            <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0"
                 height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <![endif]-->
    <!--[if lt IE 9]>
    <script src="/js/html5.js"></script>
    <link rel="stylesheet" href="/css/ie.css">
    <![endif]-->

    <!-- <link rel="shortcut icon" href="../assets/ico/favicon.ico">
       <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
       <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
       <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
       <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png"> -->

</head>
<body>

<div>
    <div>
        <div>
            <a href="#">2HandsBookShop</a>
            <a href="#"><i>Login/Register</i></a>
        </div>

    </div>
</div>


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


            <a href="index.html">HOME</a>
            <a href="#">BLOG</a>
            <a href="#">SHOP</a>
            <a href="#">FAQ</a>
            <a href="#">CONTACT</a>
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
