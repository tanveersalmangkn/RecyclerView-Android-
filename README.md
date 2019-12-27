# RecyclerView-Android-

In this project you will get to know how to make Recycler View in Android.

Advantages of Recycler View:

With the advent of Android Lollipop, the RecyclerView made its way officially. The RecyclerView is much more powerful, flexible and a major enhancement over ListView. I will try to give you a detailed insight into it.

Advantages

1) ViewHolder Pattern

In a ListView, it was recommended to use the ViewHolder pattern but it was never a compulsion. In case of RecyclerView, this is mandatory using the RecyclerView.ViewHolder class. This is one of the major differences between the ListView and the RecyclerView.

It makes things a bit more complex in RecyclerView but a lot of problems that we faced in the ListView are solved efficiently.

2) LayoutManager

This is another massive enhancement brought to the RecyclerView. In a ListView, the only type of view available is the vertical ListView. There is no official way to even implement a horizontal ListView.

Now using a RecyclerView, we can have a

i) LinearLayoutManager - which supports both vertical and horizontal lists,

ii) StaggeredLayoutManager - which supports Pinterest like staggered lists,

iii) GridLayoutManager - which supports displaying grids as seen in Gallery apps.

And the best thing is that we can do all these dynamically as we want.

3) Item Animator

ListViews are lacking in support of good animations, but the RecyclerView brings a whole new dimension to it. Using the RecyclerView.ItemAnimator class, animating the views becomes so much easy and intuitive.

4) Item Decoration

In case of ListViews, dynamically decorating items like adding borders or dividers was never easy. But in case of RecyclerView, the RecyclerView.ItemDecorator class gives huge control to the developers but makes things a bit more time consuming and complex.

5) OnItemTouchListener

Intercepting item clicks on a ListView was simple, thanks to its AdapterView.OnItemClickListener interface. But the RecyclerView gives much more power and control to its developers by the RecyclerView.OnItemTouchListener but it complicates things a bit for the developer.



