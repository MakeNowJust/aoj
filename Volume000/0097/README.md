# Sum of Integers II

0 から 100 の数字から異なる n 個の数を取り出して合計が s となる組み合わせの数を出力するプログラムを作成してください。n 個の数はおのおの 0 から 100 までとし、１つの組み合わせに同じ数字は使えません。たとえば、n が 3 で s が6 のとき、3 個の数字の合計が 6 になる組み合わせは、

    1   2   3 = 6
    0   1   5 = 6
    0   2   4 = 6

の 3 通りとなります。

## Input

複数のデータセットが与えられます。各データセットに n ( 1 ≤ n ≤ 9 ) と s ( 0 ≤ s ≤ 1000 ) が１つのスペースで区切られて１行に与えられます。n と s が共に 0 のとき入力の最後とします。

データセットの数は 50 を超えません。

## Output

各データセットに対して、n 個の整数の和が s になる組み合わせの数を１行に出力して下さい。

組み合わせの数が 1010を超える入力は与えられません。

## Sample Input

    3 6
    3 1
    0 0

## Output for the Sample Input

    3
    0

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
(modified version)   
<http://www.pref.fukushima.jp/pc-concours/>