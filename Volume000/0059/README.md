# Intersection of Rectangles

底辺が x 軸に対して平行な 2 つの長方形があります。長方形 A の左下の座標(xa1, ya1) と右上の座標(xa2, ya2)、長方形 B の左下の座標(xb1, yb1) と右上の座標(xb2, yb2)を読み込んで、それぞれについて、長方形 A と長方形 B が一部でも重なっていれば YES を、まったく重なっていなければ NO を出力して終了するプログラムを作成してください。ただし、長方形 A と長方形 B は同じものではないとします。また、接しているものも重なっているとみなします。

![][1]

## Input

    xa1 ya1 xa2 ya2 xb1 yb1 xb2 yb2 ( 1 件目のデータ：全て実数)
    xa1 ya1 xa2 ya2 xb1 yb1 xb2 yb2 ( 2 件目のデータ：全て実数)
    xa1 ya1 xa2 ya2 xb1 yb1 xb2 yb2 ( 3 件目のデータ：全て実数)
    ...
    ...

## Output

    YES または NO ( 1 件目のデータに対する出力)
    YES または NO ( 2 件目のデータに対する出力)
    YES または NO ( 3 件目のデータに対する出力)
    ...
    ...

## Sample Input

    0.0 0.0 5.0 5.0 1.0 1.0 4.0 4.0
    0.0 0.0 4.0 5.0 1.0 1.0 5.0 5.0
    0.0 0.0 4.0 4.0 -3.0 -5.0 2.0 -1.0

## Output for the Sample Input

    YES
    YES
    NO

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/intersection.gif
