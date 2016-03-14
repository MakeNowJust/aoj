# Maximum Sum Sequence

与えられた整数の並び a1, a2, a3, , , an で、連続した項(1つ以上)の和の最大値を出力して終了するプログラムを作成して下さい。

## Input

複数のデータセットが与えられます。各データセットは以下のような形式です。

    n  （項数: 1 以上 5000 以下）
    a1 （第１項: 整数 -100000 以上 100000 以下）
    a2 （第２項: 整数 -100000 以上 100000 以下）
    a3 （第３項: 整数 -100000 以上 100000 以下）
     .
     .
    an （第ｎ項: 整数 -100000 以上 100000 以下）

n が 0 のとき入力の最後とします（この場合は処理をしない）。

## Output

各データセットに対して、連続した項の和の最大値を出力して下さい。

## Sample Input

    7
    -5
    -1
    6
    4
    9
    -6
    -7
    13
    1
    2
    3
    2
    -2
    -1
    1
    2
    3
    2
    1
    -2
    1
    3
    1000
    -200
    201
    0

## Output for the Sample Input

    19
    14
    1001

* * *

Source: PC Koshien 2003 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2003   
(extended)   
<http://www.pref.fukushima.jp/pc-concours/>