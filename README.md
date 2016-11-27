# Android-FooterRecyclerView
通过自定义RecyclerView实现上拉加载功能

##使用配置<br>
_ _ _ _
####1.Add root build.gradle
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
#####2.build.gradle
```
dependencies {
	        compile 'com.github.2016yiyu:Android-FooterRecyclerView:v1.0'
	}
```
#####3.setXml
```
<footer.android.FooterRecyclerView
    android:id="@+id/footer_rv"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</footer.android.FooterRecyclerView>
```
##方法说明

