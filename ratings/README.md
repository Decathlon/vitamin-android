# Rating components

## Read only mode

### Rating design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

### Rating usage specs

As this components is a Vitamin custom one, you can find here the main available options to use it.

#### Specify the note value

You can specify the note value (as a float) in the xml declaration or in your kotlin code.

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
android:id="@+id/ratingView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnRatingView_note="3.2" />
```

or

```kotlin 
binding.ratingView.note = 3.2f
```

#### Specify the comments count value

You can specify the comments count value (as an int) in the xml declaration or in your kotlin code.

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
android:id="@+id/ratingView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnRatingView_commentsCount="125" />
```

or

```kotlin 
binding.ratingView.commentsCount = 125
```

#### Specify the comments count visibility

You can specify the comments count visibility in the xml declaration or in your kotlin code.

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
android:id="@+id/ratingView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnRatingView_showComments="true" />
```

or

```kotlin 
binding.ratingView.showComments = true
```

#### Use the compact mode

You can use the compact mode directly in the xml declaration or in your kotlin code.

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
android:id="@+id/ratingView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnRatingView_compact="true" />
```

or

```kotlin 
binding.ratingView.compact = true
```

#### Use the emphasis mode

You can use the emphasis mode directly in the xml declaration or in your kotlin code.

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
android:id="@+id/ratingView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnRatingView_emphasis="true" />
```

or

```kotlin 
binding.ratingView.emphasis = true
```

### Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the `VitaminRatingView` component. 

```kotlin 
implementation("com.decathlon.vitamin:vitamin:<version>")
```
```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

### Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

#### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin radio button style.
You can now use the rating component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="vtmnRatingViewStyle">@style/Widget.Vitamin.RatingView</item>
        <item name="vtmnRatingViewRatingBarStyle">@style/Widget.Vitamin.RatingView.RatingBar</item>
    </style>
</resources>
```

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

#### Version 2


If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:theme="@style/Theme.Vitamin">

    <com.decathlon.vitamin.ratings.VitaminRatingView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### Customize the RatingView

You can also customize the RatingView style but keep in mind that this is not recommended by Vitamin

To define in the theme
```xml
<!-- Define RatingView style using all the attributes under VitaminRatingView -->
<attr name="vtmnRatingViewStyle" format="reference" />
<!-- Define the style of the RatingView's ratingBar -->
<attr name="vtmnRatingViewRatingBarStyle" format="reference"/>
```

To define inside the style used for vtmnRatingViewStyle
```xml
<!-- Define the rating icon for compact mode -->
<attr name="vtmnRatingView_compactIcon" format="reference" />
<!-- Define the default color for ratingBar and compact rating icon -->
<attr name="vtmnRatingView_defaultIconsColor" format="reference" />
<!-- Define the emphasis color for ratingBar and compact rating icon -->
<attr name="vtmnRatingView_emphasisIconsColor" format="reference" />
<!-- Define the textAppearance for the note -->
<attr name="vtmnRatingView_noteTextAppearance" format="reference" />
<!-- Define the textAppearance for the comments count -->
<attr name="vtmnRatingView_commentsCountTextAppearance" format="reference" />


```