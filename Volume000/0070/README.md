# Combination of Number Sequences

0 から 9 までの整数を使った n 個の並び k1, k2, ,,, kn を考えます。正の整数 n と s を読み込んで、それぞれについて、

    k1   2 × k2   3 × k3   ...    n × kn = s

となっているような n 個の並びが何個あるかを出力して終了するプログラムを作成してください。ただし、1 つの「n 個の並び」には同じ数が 2 回以上現われないものとします。

## Input

    n s（1 件目のデータ：全て整数）
    n s（2 件目のデータ：全て整数）
    n s（3 件目のデータ：全て整数）
    ...

## Output

    n 個の整数の和が s になる組み合わせの個数（1 件目のデータに対する出力）
    n 個の整数の和が s になる組み合わせの個数（2 件目のデータに対する出力）
    n 個の整数の和が s になる組み合わせの個数（3 件目のデータに対する出力）
    ...

## Sample Input

    3 10
    3 1

## Output for the Sample Input

    8
    0

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>