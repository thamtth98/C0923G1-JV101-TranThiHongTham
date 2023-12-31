<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/4/2024
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../css/detailProduct.css">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
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
<!---->
<!--header-->

<div class="cc-announcement" style="text-align: center;background: black">
    <a data-cc-animate-click="">
        <div class="cc-announcement__inner" style="color: white">
            MIỄN PHÍ VẬN CHUYỂN TOÀN QUỐC
        </div>
    </a>
</div>
<nav class="navbar navbar-expand-lg bg-white px-4 mt-2" style="padding:0">
    <div class="container-fluid ">
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

<div>
    <div class="row col-12" style="margin-top: 25px; margin-left: 140px">
        <div class="bread-crumb" style="margin-left: 20px">
            <div class="container-fluid">
                <ol class="breadcrumb" style="font-family: sans-serif">
                    <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
                    <li class="breadcrumb-item"><a href="#">Thể loại</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Chi tiết sản phẩm</li>
                </ol>
            </div>
        </div>
        <div class="row">
            <div id="carouselExampleAutoplaying" class="carousel carousel-dark slide col-6 mt-25"
                 data-bs-ride="carousel"
                 style="width: 600px">
                <div class="carousel-inner " style="width: 100%">
                    <div class="carousel-item active">
                        <img src="${book.hinhAnh}"
                             class="d-block"
                             style="height: 500px;width: 500px"
                             alt="sach">
                    </div>
                    <div class="carousel-item">
                        <img src="${book.hinhAnh}"
                             class="d-block " style="height: 500px;width: 500px" alt="sach">
                    </div>
                    <div class="carousel-item">
                        <img src="${book.hinhAnh}"
                             class="d-block" style="height: 500px; width: 500px" alt="sach">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying"
                        data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying"
                        data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>

            <div class="col-6" style="margin-left: 100px">


                <!--            chi tieets-->
                <div class="details-info" style="margin-top: 10px">
                    <div>
                        <span style="background-color: #d2d0d0; padding: 5px; font-size: 13px">Sản phẩm mới</span>
                    </div>
                    <div class="name-book" style="margin:  20px 0">
                        <h3 >${book.tenSach}</h3>
                        <h4 style="font-style: italic">Tác giả: ${book.tenTacGia}</h4>
                        <h6 style="font-style: italic">${book.tenTheLoai}</h6>
                        <h6  style="font-style: italic">Số lượng: ${book.soLuong}</h6>
                    </div>
                    <div class="price-book">
                        <p style="font-size: 25px;font-weight: 0.6;font-style: italic">
                            <i class="bi bi-cash"></i>
                            <b style="font-size: 30px">Giá: </b>
                            <fmt:formatNumber value="${book.gia}" type="currency" currencyCode="VND" maxFractionDigits="0" minFractionDigits="0"/>
                            </p>
                    </div>

                </div>
                <div class="add-cart d-flex mt-3">
                    <table class="table" style="width: 60%">
                        <tr>
                            <td>Số lượng:</td>
                            <td><input type="number" value="1" style="width: 50%"></td>
                        </tr>
                    </table>

                </div>
                <div class="gift-wrapping">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" name="flexRadioDefault" id="flexRadioDefault1"
                               style="margin: 17px 5px 0 0">
                        <label class="form-check-label" for="flexRadioDefault1">
                            Nhận hộp của hãng miễn phí
                            <img src="https://eu.assouline.com/cdn/shop/files/HOMEPAGE_GIFTING_BLOCKS_f5bd2497-1197-49eb-8f0a-b40483317df1.jpg?v=1636038444&width=88">
                        </label>
                    </div>
                </div>

                <button type="button" class="btn btn-dark btn-buy">Thêm vào giỏ hàng</button>
                <button type="button" class="btn btn-dark btn-buy">Mua ngay</button>


            </div>
        </div>
    </div>

    <!--        details-->
    <div class="description">
        <table class="table">
            <tr>
                <td>
                    <h3>Mô tả</h3>
                </td>
            </tr>
            <tr>
                <td>
                    ${book.moTa}
                </td>
            </tr>
        </table>
    </div>
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
</body>
</html>
