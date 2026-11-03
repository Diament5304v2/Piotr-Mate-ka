<?php
session_start();
$db = mysqli_connect("db.peciak.xyz", "uczen", "d4552s7339", "logowanie");
if ($_SERVER["REQUEST_METHOD"]==="POST"){
    $login = isset($_POST['login']) ? $_POST['login'] : "";
    $haslo = isset($_POST['password']) ? $_POST['password'] : "";
    if($login === "" && $haslo === ""){
        $blad = "ERROR";
    }else{
        $sql = "Select * from uzytkownicy where login like '$login' AND haslo like '$haslo'";
        $wynik = mysqli_query($db, $sql);
        $wiersz = mysqli_fetch_assoc($wynik);
        if($wiersz){
            $_SESSION["login"] = $wiersz["login"];
            header("location: panel.php");
        }else{
            $blad = "ERROR";
        }
    }
}
$sql2 = "Select * from uzytkownicy order by login desc";
$wynik2 = mysqli_query($db, $sql2);
$wiersz2 = mysqli_fetch_assoc($wynik2);



?>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            font-family: sans-serif;
            margin: 2rem;
        }
        form{
            display: inline-block;
        }
        label{
            display: block;
            margin-bottom: 0.5rem;
        }
        .blad{
            background: #f5d4d4;
            padding: 0.5rem;
            display: inline-block;
        }

    </style>
</head>
<body>
    <form action="" method="post">
        <label for="login">Login</label>
        <input type="text" name="login" id="login" required>
        <label>
            Hasło:
            <input type="password" name="password" required>
        </label>
        <button type="submit">Zaloguj</button>
    </form>
    <a href=""></a>
</body>
</html>