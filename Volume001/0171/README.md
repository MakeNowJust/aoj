# Dice Puzzle

各面にアルファベット一文字(a 〜 z、A 〜 Z)が描かれたサイコロがあります。

  
![][1]  

このようなサイコロを8つ組み合わせて 2 × 2 × 2 の立方体を作ることを考えます。

  
![][2]  

組み合わせ方には条件があり、各サイコロの向き合う面は同じアルファベットでかつ一方が小文字、も う一方が大文字でなければなりません。例えば、a と描かれた面に接することができるのは A と描か れた面です。ただし、接するときの文字の向きは問いません。

  
![][3]  

このルールに従い、８つのサイコロの情報を入力とし、立方体を作れるか否かを判定し出力するプログ ラムを作成してください。立方体を作れる場合は YES（半角英大文字）、作れない場合は NO（半角英 大文字）と出力してください。 なお、サイコロの各面の文字を次の図にあるように c1〜c6 と表すことにします。また、1つのサイコ ロに同じ文字が複数回描かれていることは無いものとします（同じアルファベットの大文字と小文字は その限りではありません）。

  
![][4]  

プログラムは以下に定義する入力が続く限り処理を繰り返し、入力が終わったら終了するように作成し てください。

## Input

複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。 各データセットは以下のとおりです。

    1行目 1つ目のサイコロ情報 s（半角英文字列）
    sは長さ6の文字列でありサイコロの各面との対応は以下の通りです
    1 文字目：c1
    2 文字目：c2
    ：
    6 文字目：c6
    2行目 2つ目のサイコロ情報
    ：
    ：
    8行目 8つ目のサイコロ情報

## Output

入力データセットごとに判定結果（半角英大文字）を出力します。

## Sample Input

    zabznq
    BCxmAi
    ZcbBCj
    aizXCm
    QgmABC
    JHzMop
    ImoXGz
    MZTOhp
    zabznQ
    BCxmAi
    ZcbBCj
    aizXCm
    QgmABC
    JHzMop
    ImoXGz
    MZTOhp
    abcdef
    ABDCFE
    FBDCAE
    abcdef
    BEACDF
    bfcaed
    fabcde
    DEABCF
    UnivOf
    AizuaH
    zTXZYW
    piglIt
    GRULNP
    higGth
    uAzIXZ
    FizmKZ
    UnivOf
    AizuaH
    piglIt
    higGth
    GRULNP
    uAzIXZ
    FizmKZ
    ZTXZYW
    0

## Output for the Sample Input

    YES
    NO
    YES
    YES
    NO

* * *

Source: PC Koshien 2007 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2007   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/dicePuzzle1.jpg
[2]: IMAGE1/dicePuzzle2.jpg
[3]: IMAGE1/dicePuzzle3.jpg
[4]: IMAGE1/dicePuzzle4.jpg
