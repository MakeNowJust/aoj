# Tic Tac Toe

三目並べは，３×３のマス目の中に交互に○と×を入れていき、縦・横・斜めの何れかに一列○か×が並んだときに、そちらの勝ちとなるゲームです（図1〜図3 を参照）

図１：○の勝ち
![][1]

図２：×の勝ち
![][2]

図３：引き分け
![][3]

三目並べは、○と×が交互にマス目を埋めていき、どちらかが一列揃ったときにゲーム終了となります。そのため、図 4 のように、○と×が両方とも一列そろっている場合はありえない局面です。ありえない局面が入力されることはありません。

図４：ありえない局面
![][4]

三目並べの盤面を読み込んで、それぞれについて勝敗の結果を出力して終了するプログラムを作成して下さい。

## Input

盤面の入力は、○、×、空白をそれぞれ半角英小文字の o、x、s であらわし、1 件につき 1 行に、下の図マス目の順に並んでいます。入力例を見てください。

![][5]

## Output

○が勝ちなら半角英小文字の o を、×が勝ちなら半角英小文字の x を、引き分けならば半角英小文字の d を出力してください。

    勝敗（1 件目のデータに対する出力）
    勝敗（2 件目のデータに対する出力）
    ... 　　　　
    ...

## Sample Input

    ooosxssxs
    xoosxsosx
    ooxxxooxo

## Output for the Sample Input

    o
    x
    d

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/tic1.gif
[2]: IMAGE1/tic2.gif
[3]: IMAGE1/tic3.gif
[4]: IMAGE1/tic4.gif
[5]: IMAGE1/tic5.gif
