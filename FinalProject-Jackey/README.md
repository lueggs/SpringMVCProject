# FinalProject 須知及規範

1.極重要：每個分支請不要動到其他人的檔案(包括Homepage.jsp、global、util)，定期會Merge最新版到各分支

2.專案配置步驟：

先把workspace環境建置完成(Maven、Maven user settings、JBOSS、環境編碼)

到github desktop 點clone repository 到一個任意的新資料夾

在workspace內import專案名稱FinalProject的資料夾

確定有import成功再加入Tomcat & ALT+F5 Force Update

需加此檔案到tomcat的lib資料夾:https://repo1.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar

3.遵守命名原則:

a.駝峰原則(方法及變數首字小寫開頭，第二個單字大寫開頭，依此類推)

b.變數和table請給有意義的名稱，不要是test.a01.b2這種，如能在變數後方加註解更好

c.Java Bean Class名稱與資料庫TABLE名稱定義相同

d.介面I開頭，例如IEmployee。 實作介面則將I去掉，後面加Impl，如:EmployeeImpl

4.遵守package原則，一律是main.java.分支package.(model|action|dao|test|util)

5.請勿自行亂加jar檔，Maven專案有獨自的用法，如果POM找不到能用的再到群組內提出問題

5.環境建置好再import專案進去，

6.有任何技術或是進度問題請提早提出
