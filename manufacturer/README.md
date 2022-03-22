* vivo OriginOS中打开指定APP的通知权限设置页面
  
  ```kotlin
  val intent = Intent()
  intent.component = ComponentName(
    "com.android.systemui",  
    "com.vivo.systemui.statusbar.notification.settings.channels.NotificationSettingsActivity"
  )
  intent.putExtra("pkg", requireContext().packageName)
  requireContext().startActivity(intent)
  ```
  
  
