# Area of Polygon

1つの円に内接する2つの多角形の頂点情報を入力とし、それらの面積の大小関係を出力するプログラムを作成してください。x角形の各頂点には反時計回りに1からxまで番号が振ってあるものとします（図は、x = 4の場合の例を示しています）。ただし、与えられる多角形は円の中心を内部に含むものとし、頂点iの位置に関するデータは、頂点iから頂点i+1まで反時計回りに計った中心角の角度v（1以上180未満の整数）で与えられます。また、出力する大小関係については、第1の多角形の面積が大きい場合は1（半角数字）、第2の多角形の面積が大きい場合は2（半角数字）、それぞれの面積が等しい場合は0（半角数字）と出力してください。

![][1]

プログラムは以下に定義する入力が続く限り処理を繰り返し、入力が終わったら終了するように作成し てください。

## Input

複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。各データセットは以下のとおりです。

    1行目 第1の多角形の頂点の数 m（整数）
    2行目 第1の多角形の頂点1の情報 v1（整数）
    3行目 第1の多角形の頂点2の情報 v2
    ：
    m行目 第1の多角形の頂点m-1の情報 vm-1
    m 1行目 第2の多角形の頂点の数 n（整数）
    m 2行目 第2の多角形の頂点1の情報 v1（整数）
    m 3行目 第2の多角形の頂点2の情報 v2
    ：
    m n行目 第2の多角形の頂点n-1の情報 vn-1

## Output

入力データセットごとに大小関係（半角数字）を出力します。

## Sample Input

    4
    30
    125
    75
    4
    30
    125
    75
    5
    30
    125
    75
    65
    4
    30
    125
    75
    4
    30
    125
    75
    6
    30
    50
    50
    25
    75
    0

## Output for the Sample Input

    0
    1
    2

* * *

Source: PC Koshien 2007 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2007   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/areaOfPolygon.bmp
