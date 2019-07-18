## つまずいた箇所メモ

- settings.xmlを.m2配下に置く必要があるけれどやはり.m2が無く、Mavenをwebからインストールしてみた  
(→やはりMavenはもともと入ってるわけではない？！)  
←mavenはビルドツールでeclipseに付属している  
←mavenはプラグインで必要に応じてmavenのプラグインサイトから必要なjarをダウンロードして使用するスタイル  
←%UserProfile%\.m2フォルダはそのダウンロードしたjarを格納するローカルリポジトリなので最初は無いかも  

- eclipse上でGitのリポジトリを作成し、Githubから自分のリポジトリをeclipse上にプル？アップストリームからフェッチ？とりあえずローカルに持ってこれた  
- 実行ボタンでSpringBootアプリケーションが表示されなかった、pom.xmlのparentにエラー有ることに気付く  
→settings.xmlを見直す  
- settings.xmlのMavenのver.を間違えていたので、使ってるver.に書き換えた  
(←古いのをコピーしてsettings.xmlを作成していたため。)  
- プロジェクト更新したりMavenビルドし直したり  
- SpringBootはなんとか実行できるようになったけれどブラウザ上で表示できず  
→localhost:8080を既にPJで使っていることが判明  
→内包Tomcatのポート番号変更　(application.ymlのserver port を6060にしてみた)  
 
つながりました～～
