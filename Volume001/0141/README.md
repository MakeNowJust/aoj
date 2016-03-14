# Spiral Pattern

「ぐるぐる模様」を表示するプログラムを作成することにしました。「ぐるぐる模様」は以下のようなものとします。

* 1辺の長さがnの場合、n行n列の文字列として表示する。
* 左下隅を基点とし，時計回りに回転する渦状の模様とする。
* 線のある部分は#（半角シャープ）、空白部分は" "（半角空白）で表現する。
* 線と線の間は空白を置く。
* nは1以上100以下の整数とする。

整数nを入力とし，1辺の長さがnの「ぐるぐる模様」を出力して終了するプログラムを作成してください。

## Input

    データセットの数 d
    1 個目のぐるぐる模様の辺の長さn（整数）
    2 個目のぐるぐる模様の辺の長さn（整数）
    .
    .
    d 個目のぐるぐる模様の辺の長さn（整数）

## Output

    1 個目のぐるぐる模様（半角文字列）
    空行
    2 個目のぐるぐる模様（半角文字列）
    空行
    .
    .
    d 個目のぐるぐる模様（半角文字列）

## Sample Input

    2
    5
    6

## Output for the Sample Input

    #####
    #   #
    # # #
    # # #
    # ###

    ######
    #    #
    # ## #
    # #  #
    # #  #
    # ####

* * *

Source: PC Koshien 2006 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2006   
<http://www.pref.fukushima.jp/pc-concours/>