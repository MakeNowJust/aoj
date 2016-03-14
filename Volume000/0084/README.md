# Search Engine

インターネットの検索エンジン、例えば、Googleなどでは、世界中のウェブページを自動で収捨して分類し、巨大なデータベースを作成します。また、ユーザが入力した検索キーワードを解析して、データベース検索のための問い合わせ文を作成します。

いずれの場合も、効率的な検索を実現するために複雑な処理を行っていますが、とりあえずの基本は全て文章からの単語の切り出しです。

ということで、文章からの単語の切り出しに挑戦してください。今回は以下の通り、単語区切りが明確な英語の文章を対象とします。

* 対象となる文章　：　改行を含まない1024文字以下の英語の文章
* 区切り文字 ：　いずれも半角で空白、ピリオド、カンマのみ
* 切り出す単語　：　3から6文字の単語（2文字以下や7文字以上の単語は無視）　

## 入力

区切り文字及び英数字で構成される英文１行（すべて半角）

## 出力

空白文字１文字（半角）で区切られた単語

## Sample Input

    Rain, rain, go to Spain.

## Output for the Sample Input

    Rain rain Spain

## Sample Input 2

    Win today's preliminary contest and be qualified to visit University of Aizu.

## Output for the Sample Input 2

    Win and visit Aizu

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
<http://www.pref.fukushima.jp/pc-concours/>