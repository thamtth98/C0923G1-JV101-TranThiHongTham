<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/4/2024
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://kit.fontawesome.com/1fd1ef22a8.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <link rel="stylesheet" href="../css/product.css">
    <!--    <link rel="stylesheet" href="../main.css/">-->
    <link rel="stylesheet" href="../css/header.css">
    <link rel="stylesheet" href="../css/footer.css">

</head>
<body>
<!--header-->
<div class="cc-announcement " style="text-align: center;background: black">
    <a data-cc-animate-click="">
        <div class="cc-announcement__inner" style="color: white">
            MIỄN PHÍ VẬN CHUYỂN TOÀN QUỐC
        </div>
    </a>
</div>
<nav class="navbar navbar-expand-lg bg-white px-4 mt-2" style="padding:0">
    <div class="container-fluid header">
        <div>
            <a class="navbar-brand" href="#">
                <img src="https://www.shutterstock.com/image-vector/leaf-book-logo-600nw-1768607174.jpg"
                     height="130px" width="200px"/></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
            </button>

        </div>

        <div style="margin: 0 auto">
            <div class="collapse navbar-collapse ">
                <nav>
                    <ul>
                        <li href="#">Trang Chủ</li>
                        <li class="nav-item dropdown" style="padding: 10px;">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                               aria-expanded="false" style="color: #6d6969">
                                Thể loại
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="/book?typeBook=1">Trinh thám</a></li>
                                <li><a class="dropdown-item" href="/book?typeBook=2">Tiểu thuyết</a></li>
                                <li><a class="dropdown-item" href="/book?typeBook=3">Self-help</a></li>
                            </ul>
                        </li>
                        <li href="#">Tin tức</li>
                        <li href="#">Trợ giúp</li>
                    </ul>
                </nav>
            </div>
        </div>
        <div style="left: 0">
            <div class="collapse navbar-collapse ">
                <form id="search-box">
                    <input type="text" id="search-text" placeholder="Bạn muốn tìm gì ?" required>
                    <button id="search-btn"><i class="fa-solid fa-magnifying-glass"
                                               style="color: white"></i>
                    </button>
                </form>
                <ul style="margin: 0;font-weight: 500; font-size: 15px;color: rgb(119,119,119);padding:30px 20px">
                    <span-1><i class="fa-solid fa-cart-shopping" style="font-size: 20px"></i> Giỏ Hàng
                    </span-1>
                    <span-1 style="margin-right: 15px">
                        <i class="fa-solid fa-user" style="font-size: 20px"></i> Đăng Nhập
                    </span-1>

                </ul>
            </div>

        </div>
    </div>
</nav>

<!--main-->
<!--banner-->
<div id="banner">
    <div class="row col-12" style="margin:0 20px; font-family: sans-serif">
        <div class="col-4">
            <h2 style="margin-top: 100px">
                Sách
            </h2>
            <p>
                Mỗi quyển sách là một cuộc phiêu lưu mới, là một bức tranh tâm huyết được vẽ nên từ tư duy sáng tạo của
                tác giả. Trong mỗi dòng văn, những ý tưởng trở nên sống động, hình ảnh trở nên huyền bí, và từng lời
                diễn đạt như là những bản nhạc êm đềm. Sách không chỉ là nguồn kiến thức mà còn là nguồn cảm hứng, là
                nguồn năng lượng để tâm hồn ta trỗi dậy.
            </p>
        </div>
        <div class="banner-img col-8">
            <img src="https://eu.assouline.com/cdn/shop/collections/COLLECTION_HEADER_FASHIONIC_2048x.jpg?v=1699539441"
                 width="100%" height="500px">
        </div>

    </div>
</div>
<!--bread crumb-->
<!--giá sách, tìm kiếm-->
<div class="bread-crumb" style="margin-left: 20px; ">
    <nav class="navbar bg-body-tertiary">
        <div class="container-fluid">
            <ol class="breadcrumb" style="font-family: sans-serif; color: black">
                <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
                <li class="breadcrumb-item"><a href="#">Thể loại</a></li>
                <li class="breadcrumb-item active" aria-current="page" id="breadcrumb">${resultType}</li>
            </ol>
            <form class="d-flex" role="search" action="/book" method="post">
                <input type="hidden" name="action" value="searchByName">
                <input class="form-control me-2" type="search" placeholder="Tìm kiếm tên sách" aria-label="Search"
                name="search-name">
                <button class="btn btn-outline-dark" type="submit" style="width: 150px">Tìm kiếm</button>
            </form>
        </div>
    </nav>
</div>

<!--sách-->
<div class="container-fluid">
    <section>
        <div class="row wrapper-box-card">
            <c:forEach items="${bookList}" var="book">
                <div class="col-lg-4 col-md-6 col-sm-6 col-12" id="detailBook">
                    <div class="card box-card" style="height: 600px;">
                        <img src="${book.hinhAnh}"
                             alt="sach" style="object-fit: fill; border-radius: 20px; height: 400px">
                        <div class="card-body">
                            <h5 class="card-title">${book.tenSach}</h5>
                            <div class="d-flex"
                                 style="justify-content: space-between; align-items: center;margin-bottom: 5px ">
                                <div class="card-star">
                                    <span class="star_1">&#9733;</span>
                                    <span class="star_1">&#9733;</span>
                                    <span class="star_1">&#9733;</span>
                                    <span class="star_1">&#9733;</span>
                                    <span class="star_1">&#9733;</span>
                                </div>
                                <div class="card-price__2" style="font-weight: bold">
                                    <fmt:formatNumber value="${book.gia}" type="currency" currencyCode="VND" maxFractionDigits="0" minFractionDigits="0"/>
                                </div>
                            </div>
                            <div class="d-flex"
                                 style="justify-content: space-between; align-items: center;margin-bottom: 5px">
                                <a href="#" class="btn btn-outline-dark"><span>
                            <i class="fa-solid fa-cart-shopping"></i>+Giỏ Hàng</span></a>
                                <a href="/book?action=detailBook&idSach=${book.idSach}" class="btn btn-outline-dark" style="margin-left: 15px">Chi tiết</a>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>


        <!--footer-->
        <footer style="background: black; margin-top: 200px">
            <div class="waves">
                <div class="wave" id="wave1"></div>
                <div class="wave" id="wave2"></div>
                <div class="wave" id="wave3"></div>
                <div class="wave" id="wave4"></div>
            </div>
            <ul class="social_icon">
                <li><a href="#">
                    <ion-icon name="logo-facebook"></ion-icon>
                </a></li>
                <li><a href="#">
                    <ion-icon name="logo-twitter"></ion-icon>
                </a></li>
                <li><a href="#">
                    <ion-icon name="logo-instagram"></ion-icon>
                </a></li>
                <li><a href="#">
                    <ion-icon name="mail-outline"></ion-icon>
                </a></li>
                <li><a href="#">
                    <ion-icon name="logo-youtube"></ion-icon>
                </a></li>
            </ul>
            <ul class="menu">
                <li><a href="#">Trang chủ</a></li>
                <li><a href="#">Tin tức </a></li>
                <li><a href="#">Dịch vụ</a></li>
                <li><a href="#">Đội ngũ</a></li>
                <li><a href="#">Hỗ trợ</a></li>
            </ul>
            <p style="color: white">©Leaf Book || Được xây dựng năm 2020</p>
        </footer>

        <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    </section>
</div>
</body>
</html>

