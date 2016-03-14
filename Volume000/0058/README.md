# Orthogonal

平面上の異なる 4 点、A(xA, yA), B(xB, yB), C(xC, yC), D(xD, yD) の座標を読み込んで、それぞれについて、直線 AB と CD が直交する場合には YES、直交しない場合には NO と半角大文字で出力して終了するプログラムを作成してください。ただし、xA, yA, xB, yB, xC, yC, xD, yD は、それぞれ -100 以上 100 以下の実数とします。ここで、「直線」とは線分のことではありません。以下の図を参考にして下さい。

![][1]

## Input

    xA yA xB yB xC yC xD yD (1 件目のデータ：全て実数)
    xA yA xB yB xC yC xD yD (2 件目のデータ：全て実数)
    xA yA xB yB xC yC xD yD (3 件目のデータ：全て実数)
    ...
    ...

各値は小数点以下最大5桁までの数字を含む実数である。

データセットの数 n は 100 を超えない。

## Output

    YES または NO（1 件目のデータに対する出力）
    YES または NO（2 件目のデータに対する出力）
    YES または NO（3 件目のデータに対する出力）
    ...
    ...

## Sample Input

    1.0 1.0 2.0 2.0 0.0 0.0 1.0 -1.0
    0.0 0.0 2.0 0.0 -1.0 2.0 2.0 2.0
    10.0 6.0 3.4 5.2 6.8 9.5 4.3 2.1
    2.5 3.5 2.5 4.5 -3.3 -2.3 6.8 -2.3

## Output for the Sample Input

    YES
    NO
    NO
    YES

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/orthogonal.gif
