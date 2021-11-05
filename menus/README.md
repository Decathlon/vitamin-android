# Menu component

## Menu design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default 
`PopupMenu`/`ListPopupWindow` components or the `VitaminMenu`/`VitaminListMenu` components.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

### Menu

```kotlin
val menu = VitaminMenu(requireContext(), anchorView)
menu.menuInflater.inflate(menuRes, popup.menu)
menu.setOnMenuItemClickListener { return@setOnMenuItemClickListener false }
menu.setOnDismissListener {}
menu.show()
```

or

```kotlin
val popup = PopupMenu(requireContext(), anchorView, Gravity.NO_GRAVITY, R.attr.popupMenuStyle, 0)
popup.menuInflater.inflate(menuRes, popup.menu)
popup.setOnMenuItemClickListener { return@setOnMenuItemClickListener false }
popup.setOnDismissListener {}
popup.show()
```

### List Menu

```kotlin
val listMenu = VitaminListMenu(requireContext(), anchorView)
listMenu.setSimpleAdapter(listOf("Option 1", "Option 2", "Option 3"))
listMenu.setOnItemClickListener { _: AdapterView<*>?, _: View?, _: Int, _: Long ->
    listMenu.dismiss()
}
listMenu.show()
```

or

```kotlin
val listPopupWindow = ListPopupWindow(requireContext(), null, R.attr.listPopupWindowStyle)
listPopupWindow.anchorView = anchorView
listPopupWindow.setSimpleAdapter(listOf("Option 1", "Option 2", "Option 3"))
listPopupWindow.setOnItemClickListener { _: AdapterView<*>?, _: View?, _: Int, _: Long ->
    listPopupWindow.dismiss()
}
listPopupWindow.show()
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your
entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the 
Vitamin popup styles. You can now use Popup components as seen previously.

```kotlin
implementation("com.decathlon.vitamin:menus:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="android:spinnerDropDownItemStyle">?attr/vtmnDropDownItemStyle</item>
        <item name="spinnerDropDownItemStyle">?attr/vtmnDropDownItemStyle</item>
        <item name="vtmnDropDownItemStyle">@style/Widget.Vitamin.Dropdown</item>
        <item name="popupMenuStyle">@style/Widget.Vitamin.Menu</item>
        <item name="listPopupWindowStyle">@style/Widget.Vitamin.Menu.List</item>
    </style>
</resources>
```

### Version 2

If you don't want to override all the menu components of your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:menus:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```kotlin
// Popup
val popup = PopupMenu(requireContext(), v, Gravity.NO_GRAVITY, R.attr.popupMenuStyle, R.style.Widget_Vitamin_Menu)

// ListPopup
val listPopup = ListPopupWindow(requireContext(), null, R.attr.listPopupWindowStyle, R.style.Widget_Vitamin_Menu_List)
```

## Dropdown List Menu

The Vitamin subclass of `ListPopupWindow`, `VitaminListMenu`, declare 2
functions to help you to declare your dropdown according to the Vitamin dropdown specs.

```kotlin
fun setSimpleAdapter(items: List<String>)
```

The most simple adapter to display a list of strings. It uses an `ArrayAdapter` behind.

```kotlin
fun setAdapter(items: List<Item>, @LayoutRes layout: Int = R.layout.vtmn_dropdown_item)
```

An item contains a text and optionally an icon right and/or left. These drawable should be
an icon and will be tinted with the `vtmnContentPrimary` Vitamin semantic color.

If you have a specific case, you can override the layout and specify your own one but you must
to specify these ids for the text and two icons: `vtmnDropdownLeftIcon`, `vtmnDropdownRightIcon`
and `vtmnDropdownText`.

Note that we don't recommend to use this function because you won't respect Vitamin specs no more.
