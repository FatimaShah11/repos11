<!DOCTYPE>
<html>
<title>GitHub Basics</title>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body {
   background-image:url(B.jpg);
   width: 100%;
   hight: 100%;
}
h1   {
   color:black;
   text-align:left;
   background-color:gray;
   font-size:130%;
}
p    {
   color:black;
   text-align:left;
   font-size:120%;
}
h2   {
   color:black;
   text-align:left;
   font-size:150%;
   
}
h3   {
   color:black;
   text-align:left;
   font-size:150%;
}
h4   {
   color:black;
   text-align:left;
   font-size:150%;
}
h5   {
    color:black;
    text-align:left;
    font-size:150%;
}
.column {
  float: left;
  width: 50%;
  padding: 10px;
}

/* Clearfix (clear floats) */
.row::after {
  
  float: right;
  
}
</style>
<h1 style="font-family:Lucida Handwriting;"><marquee behavior="up">GitHub Command Line Basics</marquee></h1>
<br><h2 style="padding: 5px;text-align: justify;font-family:Lucida Handwriting;">What is GitHub?</h2>
<body>
<div class="row">
  <div class="column">
   <p style="padding: 5px; width: 500px; height: 50px; text-align: justify;font-family:Calibri;">GitHub is the web interface for Git, a version control software (typically used by developers) that allows multiple users to make separate changes to a program at same time without getting in each others way.</p>
  </div>
 
  <div class="column">
    <img src="example.PNG"; style="margin-left: 98%;
  margin-right: 2%; padding: 5px;border-radius: 5px;float: right;width:100%;height:200"><br>
  </div>
</div>
<br><h3 style="padding: 10px;text-align: justify;font-family:Lucida Handwriting;">Steps to Install and Launch GitHub for Windows?</h2>
<br>
<style>
* {box-sizing: border-box}
body {font-family: Verdana, sans-serif; margin:0}
.mySlides {display: none}
img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 800px;
  position: relative;
  margin: auto;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 35%;
  width: auto;
  padding: 16px;
  margin-top: 30px;
  color: grey;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: red;
  margin-top: 20px;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: dark grey;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .prev, .next,.text {font-size: 11px}
}

</style>
	
</head>

<body>

<div class="slideshow-container">
<div class="mySlides fade">
  <div class="numbertext">1 / 20</div>
  <img src="1.PNG" style="width:800;height:400">
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 20</div>
  <img src="2.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">3 / 20</div>
  <img src="3.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">4 / 20</div>
  <img src="A1.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">5 / 19</div>
  <img src="A2.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">6 / 19</div>
  <img src="6.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">7 / 20</div>
  <img src="7.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">8 / 19</div>
  <img src="8.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">9 / 20</div>
  <img src="9.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">10 / 20</div>
  <img src="10.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">11 / 20</div>
  <img src="10b.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">12 / 20</div>
  <img src="11.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">13 / 20</div>
  <img src="12.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">14 / 20</div>
  <img src="13.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">15 / 20</div>
  <img src="14.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">16 / 20</div>
  <img src="15.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">17 / 20</div>
  <img src="16.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div> <div class="mySlides fade">
  <div class="numbertext">18 / 20</div>
  <img src="17.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">19 / 20</div>
  <img src="18.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<div class="mySlides fade">
  <div class="numbertext">20 / 20</div>
  <img src="19.PNG" style="width:800;height:400">
  <div class="text">Caption Three</div>
</div>
<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
<a class="next" onclick="plusSlides(1)">&#10095;</a>

</div>
<br>

<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span> <span class="dot" onclick="currentSlide(2)"></span> <span class="dot" onclick="currentSlide(3)"></span> <span class="dot" onclick="currentSlide(4)"></span> <span class="dot" onclick="currentSlide(5)"></span> <span class="dot" onclick="currentSlide(6)"></span> <span class="dot" onclick="currentSlide(7)"></span> <span class="dot" onclick="currentSlide(8)"></span> <span class="dot" onclick="currentSlide(9)"></span> <span class="dot" onclick="currentSlide(10)"></span> <span class="dot" onclick="currentSlide(11)"></span> <span class="dot" onclick="currentSlide(12)"></span> <span class="dot" onclick="currentSlide(13)"></span> <span class="dot" onclick="currentSlide(14)"></span> <span class="dot" onclick="currentSlide(15)"></span> <span class="dot" onclick="currentSlide(16)"></span> <span class="dot" onclick="currentSlide(17)"></span> <span class="dot" onclick="currentSlide(18)"></span> <span class="dot" onclick="currentSlide(19)"></span> <span class="dot" onclick="currentSlide(20)"></span> 
</div>
<script>
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}
</script>
</body>
<style>
table  {
      font-family:arial,sans serif;
      border-collapse:20%;
      width:100%;
}
th    {
      border:2px solid #000000;
      background-color:gray;
      text-align:center;
      padding:8px;
}
td    {
      border:1px solid #000000;
      background-color:white;
      text-align:center;
}
</style>
</head>
<body>
<table>
<tr>
   <th><b>Sr.</b></th>
   <th>DISCRIPTION</th>
   <th>UNDERGROUND PROGRAM</th>
   <th>GRADUATE PROGRAMS</th>
</tr>
<tr>
   <td><b>1</b></td>
   <td style="background-color:lightgray;">Total at the time of admission</td>
   <td>118,000</td>
   <td>68,750</td>
</tr>
<tr>
    <td><b>2</b></td>
    <td style="background-color:lightgray;">Per Semester</td>
    <td>96,000</td>
    <td>46,750</td>
</tr>
</table>
</body>
<p>For more info.:</p>
<p><a href="https://www.comsats.edu.pk/">www.comsats.edu.pk</a></p> 
<h3><ins>*FAST University,Islamabad:-</ins></h3>
<p style="text-align:left";>FAST is the public sector university,recognized by HEC.It is located in Lahore, Karachi, Islamabad, Faisalabad, Peshawar. The university offers programs in engineering, management sciences, business administration, humanities and social science fields.</p>
<img src="fast.jpg" style="float:right;width:400;height:200;border:4px dotted black;">
<p><b>FEE Structure:</b></p>
<head>
<style>
table  {
      font-family:arial,sans serif;
      border-collapse:20%;
      width:100%;
}
th    {
      border:2px solid #000000;
      background-color:gray;
      text-align:center;
      padding:8px;
}
td    {
      border:1px solid #000000;
      background-color:white;
      text-align:center;
}
</style>
</head>
<body>
<table>
<tr>
   <th>Sr.</th>
   <th>Fee Type</th>
   <th>BBA / BS</th>
   <th>MBA</th>
   <th>MS / PhD</th>
</tr>
<tr>
   <td>1</td>
   <td style="background-color:lightgray;">Admission Fee</td>
   <td>Rs. 15,000</td>
   <td>Rs. 15,000</td>
   <td>Rs. 15,000</td>
</tr>
<tr>
    <td>2</td>
    <td style="background-color:lightgray;">Tuition Fee</td>
    <td>Rs. 6,700 per credit hour</td>
    <td>Rs. 7,000 per credit hour</td>
    <td>Rs. 7,000 per credit hour</td>
</tr>
</table>
</body>
