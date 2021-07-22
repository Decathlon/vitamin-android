# Vitamin Theme

## How to use it?

### Style your app

To use Vitamin in your app, you just need to inherit from `Theme.Vitamin` in your current app theme.
All the Vitamin colors, fonts and components will be directly applied (except if you already override them).

```xml
<style name="AppTheme" parent="Theme.Vitamin" />
```

```xml
<manifest
    ... >

    <application
        ...
        android:theme="@style/AppTheme">

        ...
        
    </application>

</manifest>
```

`Theme.Vitamin` is a standard Android theme, so you can also use it to style only some parts of your app.

### Style your activities

```xml
<style name="ActivityTheme" parent="Theme.Vitamin" />
```

```xml
<manifest
    ... >

    <application
        ... >

        <activity
            ...
            android:theme="@style/ActivityTheme"/>
        
    </application>

</manifest>
```

### Style subpart of you screens

```xml
<style name="SubpartTheme" parent="Theme.Vitamin" />
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:theme="@style/SubpartTheme">
    
        ...

</androidx.constraintlayout.widget.ConstraintLayout>
```

## More examples?

For more precise documentation of every Vitamin component, you can read the README.md of their own modules.

You can also find some examples of usage in [the sample app](https://github.com/Decathlon/vitamin-android/tree/main/sample).
