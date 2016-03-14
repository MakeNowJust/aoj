# The Shortest Path on A Rhombic Path

![][1]

図１に例示するように整数（0以上99以下）をひしがたに並べます。このような、ひしがたを表すデータを読み込んで、一番上からスタートして一番下まで次のルールに従って進むとき、通過する整数の和の最大値を出力して終了するプログラムを作成してください。

・　各ステップで、対角線上の左下か対角線上の右下に進むことができます。

例えば図1の例では、図2に示すように、7,3,8,7,5,7,8,3,7を選んで通ったとき、その和は最大の55（7 3 8 7 5 7 8 3 7=55）となります。

## Input

図1のひしがたの場合、入力例のようにデータが保存されています。データの行数は、100行未満です。

## Output

ルールに従って通過する整数の和の最大値

## Sample Input

    7
    3,8
    8,1,0
    2,7,4,4
    4,5,2,6,5
    2,7,4,4
    8,1,0
    3,8
    7

## Sample Output

    55

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/17_1.gif
