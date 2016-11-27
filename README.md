# Android-FooterRecyclerView
通过自定义RecyclerView实现上拉加载功能,有时间将会把下拉刷新添加进去

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
```
        footer_rv.setEnabled(true); //允许滑动到底部上拉加载
        footer_rv.setmIsAutoLoadMore(true);   //设置滑到底部自动加载
        //设置监听默认开启上拉加载
        footer_rv.setOnLoadListener(new FooterRecyclerView.OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
            }
        });
          footer_rv.onLoadMoreComplete();//加载完成
 ```
#####感谢
 添加头部尾部借鉴:http://blog.csdn.net/jxxfzgy/article/details/47012097

