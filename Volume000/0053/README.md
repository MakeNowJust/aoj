# Sum of Prime Numbers

p(i)を小さい方から i 番目の素数とします。例えば、7 は、2, 3, 5, 7 と小さい方から4 番目の素数なので、p(4) = 7 です。n が与えられたとき、i = 1 から n までの p(i) の和 s

    s = p(1)   p(2)   ....   p(n)

を出力して終了するプログラムを作成してください。例えば、n = 9 のとき、s = 2 3 5 7 11 13 17 19 23 = 100 となります。ただし、n は10000 以下の正の整数とします

## Input

複数のデータセットが与えられます。各データセットに n が与えられます。n が 0 のとき入力の最後とします。

## Output

各データセットの n に対して、s を一行に出力して下さい。

## Sample Input

    2
    9
    0

## Output for the Sample Input

    5
    100

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>