# League Match Score Sheet

スポーツの大会にはリーグ戦とトーナメント戦があります。サッカーのリーグ戦では勝・負・引分にそ れぞれ点数を付け、その勝ち点で順位を競います。勝ち点はそれぞれ勝(3点)、負(0点)、引分(1 点)です。 チーム数とリーグ戦の成績を入力とし、成績の良い順(勝ち点の多い順)に並べ替え、チ ーム名と勝ち点を出力して終了するプログラムを作成してください。勝ち点が同点の場合は入力順に出 力してください。チーム名は20文字以内のアルファベットとし、チーム数は10チーム以内とします。

## Input

複数のデータセットが与えられます。各データセットは以下のとおりです：

    1行目 チーム数(整数)
    2行目 チーム名1 勝の数 負の数 引分の数
    (半角20文字以内のアルファベット 整数 整数 整数;半角空白区切り)
    3行目 チーム名2 勝の数 負の数 引分の数
    (半角20文字以内のアルファベット 整数 整数 整数;半角空白区切り)
         :
         :

チーム数が 0 のとき、入力の終了とします（0 の場合の処理はしない）。

## Output

各データセットごとに、以下の形式で出力してください：

    チーム名,勝ち点(半角英字,整数;半角カンマ区切り)
        :
        :

データセットの間に１つの空行を入れてください。

## Sample Input

    4
    Japan 1 0 2
    Egypt 1 2 0
    Canada 0 2 1
    Spain 2 0 1
    3
    India 0 2 0
    Poland 1 0 1
    Italy 1 0 1
    0

## Output for the Sample Input

    Spain,7
    Japan,5
    Egypt,3
    Canada,1

    Poland,4
    Italy,4
    India,0

* * *

Source: PC Koshien 2006, Preliminary Round , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2006   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>