# Circles Intersection

中心が (xa, ya) で半径 ra の円 A と、中心が (xb, yb) で半径 rb の円 B が与えられたとき、 B が A の中にあるとき 2、A が B の中にあるとき -2、A の円周と B の円周が交わっている場合 1、A と B が重なっていないとき 0 を出力して終了するプログラムを作成して下さい。なお A と B は同じものではないとします。

## Input

複数のデータセットが与えられます。１行目にデータセット数 N が与えられます。つづいて N 行の入力が与えられます。各データセットの形式は以下のとおりです。

    xa ya ra xb yb rb

ここで、入力の値はすべて実数です。

## Output

各データセットに対して、2, -2, 1, 0 のいずれかの数値を１行に出力して下さい。

## Sample Input

    2
    0.0 0.0 5.0 0.0 0.0 4.0
    0.0 0.0 2.0 4.1 0.0 2.0

## Output for the Sample Input

    2
    0

* * *

Source: PC Koshien 2003 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2003   
<http://www.pref.fukushima.jp/pc-concours/>