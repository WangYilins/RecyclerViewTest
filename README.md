# RecyclerViewTest
使用 RecyclerView 需要在 build.gradle 中添加依赖库。

打开 app/build.gradle 文件，在 dependencies 闭包中添加：

implementation 'com.android.support:recyclerview-v7:27.1.1'

新建一个适配器类 FruitAdapter 继承自 RecyclerView.Adapter，并将泛型指定为 FruitAdapter.ViewHolder。ViewHolder 是在 FruitAdapter 中定义的一个内部类，继承自 RecyclerView.ViewHolder，ViewHolder 的构造函数中需要传入一个View参数，这个参数通常就是 RecyclerView 子项的最外层，所以可以使用 view.findViewById() 方法获取布局中的控件。

继承自 RecyclerView.Adapter 的类都需要重写 onCreateViewHolder()，onBindViewHolder()，getItemCount() 这三个方法。

onCreateViewHolder() 方法用于创建 ViewHolder 实例，在这个方法中将布局文件加载进来，最后返回 ViewHolder 的实例。

onBindViewHolder() 方法用于对RecyclerView 中的子项进行赋值，会在每个子项滚动到屏幕内的时候执行。

getItemCount() 方法用于告诉 RecyclerView 一共有多少个子项，直接返回数据源的长度。

LayoutManager 用于指定 RecyclerView 的布局方式。RecyclerView 提供了 LinearLayoutManager 用于实现线性布局、GirdLayoutManager 用于实现网格布局、StaggeredGridLayoutManager用于实现瀑布流布局。

通过 RecyclerView 的 setLayoutManager() 方法进行设置布局，最后通过 setAdapter() 方法完成适配器的设置。

只需要调用 LinearLayoutManager 的 setOrientation() 方法，传入 LinearLayoutManager.HORIZONTAL 参数，即可实现横向滑动。

RecyclerView 的点击事件需要在 onCreateViewHolder() 方法中注册。通过 ViewHolder 得到每个控件的实例后调用 setOnClickListener() 为每一个控件添加点击事件。
