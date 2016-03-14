# Is it Convex?

平面上の異なる4 点　A(xa, ya), B(xb, yb), C(xc, yc), D(xd, yd) の座標を読み込んで、それぞれについて、それら4 点を頂点とした四角形 ABCD に凹みがなければ YES、凹みがあればNO と半角大文字で出力して終了するプログラムを作成してください。なお、xa, ya, xb, yb, xc, yc, xd, yd は、それぞれ-100 以上100 以下の実数とします。

凹みのある四角形とは図1 のような四角形です。

![][1]

なお、1 直線上に3 つ以上点が並ぶことはないものとします。また、入力順に点を結んでいけば、四角形になる順番に点の座標が入力されるものとします。（つまり、図2 のような形になる順番はありません。)

## Input

    xa,ya,xb,yb,xc,yc,xd,yd（1 件目のデータ:全て実数）
    xa,ya,xb,yb,xc,yc,xd,yd（2 件目のデータ:全て実数）
    xa,ya,xb,yb,xc,yc,xd,yd（3 件目のデータ:全て実数）
    ...
    ...

## Output

    YES または NO (1 件目のデータに対する出力)
    YES または NO (2 件目のデータに対する出力)
    YES または NO (3 件目のデータに対する出力)
    ...
    ...

## Sample Input

    0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0
    0.0,0.0,3.0,0.0,1.0,1.0,1.0,3.0

## Output for the Sample Input

    YES
    NO

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/isConvex.gif
