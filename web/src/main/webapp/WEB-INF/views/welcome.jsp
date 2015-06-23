<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome Page</title>
    <link href="././Resources/css/searchgallery.css" rel="stylesheet">
</head>
<body>
Welcome to Spring Social Flickr, ${flickrUser}!
  
<form action="signout" method="POST">
      <button type="submit">Sign out</button>
</form>
<br/>
${messages}
<br>

<h1>Testing Photo Template</h1>
<hr>
<h2>add tags to photo</h2>

<form action="addtags" method="POST">
    <label>Tags(comma separated) : </label><input type="text" name="tags"/>
    <label>Photo Id : </label><input type="text" name="photoid"/>
    <input type="submit" value="add tags"/>
</form>

<h2>delete photo</h2>

<form action="deletephoto" method="POST">
    <label>Photo Id : </label><input type="text" name="photoid"/>
    <input type="submit" value="delete photo"/>
</form>

<h2>upload photo</h2>

<form action="uploadphoto" method="POST" enctype="multipart/form-data">
    <label>Photo : </label>
    <input type="file" name="photo"/>
    title: <input type="text" name="title"/> <br/>
    description: <textarea rows="10" name="description"></textarea> <br/>
    <input type="submit" value="upload photo"/>

    <b>${photoId}</b>

</form>

<form action="searchphotos" method="GET">
    <label>Tags(comma separated): </label><input type="text" name="tags"/>
    <label>Free text </label><input type="text" name="free_text"/>
    <input type="submit" value="search photos"/>

</form>

<div class="gallery" align="center">
 <div class="photos">
 <c:forEach var="i" items="${photos}">
    <img onmouseover="preview.src=${i.name}.src" name="${i.name}" src="${i.url}" alt=""/>
</c:forEach> 
 </div><br/>
 <div class="preview" align="center">
  <img name="preview" src="images/img1.jpg" alt=""/>
 </div>

</div>


</body>
</html>
