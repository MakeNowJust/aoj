# Parallelism

A = (x1, y1), B = (x2, y2), C = (x3, y3), D = (x4, y4) の異なる４つの座標点が与えられたとき、直線 AB と CD が平行かどうかを判定し、平行である場合には YES、平行でない場合には NO と出力して終了するプログラムを作成して下さい。なお、x1, y1, x2, y2, x3, y3, x4, y4 は、それぞれ -100 以上 100 以下とします。

## Input

複数のデータセットが与えられます。一行目にデータセットの数 n が与えられます。つづいて n 行のデータセットが与えられます。各データセットの形式は以下のとおりです。

    x1 y1 x2 y2 x3 y3 x4 y4

各値は小数点以下最大5桁までの数字を含む実数である。

データセットの数 n は 100 を超えない。

## Output

各データセットに対して、YES または NO を１行に出力して下さい。

## Sample Input

    2
    0.0 0.0 1.0 1.0 1.0 0.0 2.0 1.0
    3.0 2.0 9.0 6.0 13.0 5.0 7.0 9.0

## Output for the Sample Input

    YES
    NO

* * *

Source: PC Koshien 2003 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2003   
<http://www.pref.fukushima.jp/pc-concours/>