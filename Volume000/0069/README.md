# Drawing Lots II

縦線が n 本のあみだくじがあります。このあみだくじは以下の条件を満たしています。

* 横線は真横に引きます。斜めに引くことはありません。
* 横線は必ず隣り合った縦線同士をつなぎます。つまり、横線が縦線をまたぐことはありません。
* どの縦線についても同じ点から左右同時に横線が出ることはありません。つまり、横線が縦線を横切ることはありません。
* 当りはひとつだけです。

下図 に n = 5 のときの、あみだくじの例を示します。上側の数字は縦線の番号(左から1, 2, 3, 4, 5 ) を表します。☆が当たりです。

![][1]

縦線の本数 n、選んだ縦線の番号 m、あみだくじの当りの場所、各段における横線の有無を読み込んで、当りにたどり着けるかどうかの判定を出力して終了するプログラムを作成してください。ただし、与えられたあみだくじの任意の位置に1 本だけ横線を付け加えることができるものとします（付け加えなくてもかまいません）。横線を1 本付け加えた後のあみだくじも前述の条件を満たしていなければなりません。

## Input

複数のデータセットが与えられます。各データセットは以下のとおりです：

１行目に、縦線の本数 n (1 < n ≤ 10) が記録されています。  
２行目には、選んだ縦線の番号 m (1 ≦ m ≦ n) が記録されています。  
３行目には、当りの場所（図でいう☆）が左から数えて何番目かが記録されています。  
４行目には、あみだくじの段数 d (1 ≦ d ≦ 30)が記録されています。  
５行目以降は、図 に対応する数字の並びのように、あみだくじの上から順に、各縦線の間に横線があるときを 1、ないときを 0 として、n - 1 つの数字が並んでいます。  
あみだくじの段数は d です。  
入力例を参考にしてください。

入力は0１つの行で終わります。

## Output

各データセットについて、選んだ縦線の番号 m から当りにたどり着けるかどうかに応じて以下の値を出力してください。

* 横線を引かなくても当りにたどり着けるときは 0 を出力してください。
* 横線を1 本引けば当りにたどり着けるときは、その中で最も出発側（図でみて上）に近い横線の位置を出力してください。出発側から数えて何段目（図 を参考にしてください）に、左から数えて何番目の縦線から右に向かって横線を引くかを半角の空白で区切って出力してください。
* 横線を1 本引いても当りにたどり着けないときには 1 を出力してください。

## Sample Input

    5
    2
    3
    9
    1010
    1001
    0100
    1001
    0010
    1000
    0100
    0101
    1010
    0

## Output for the Sample Input

    6 4

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/lotsII.gif