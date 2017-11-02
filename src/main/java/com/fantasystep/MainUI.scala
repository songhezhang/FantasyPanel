package com.fantasystep

import com.vaadin.ui.VerticalLayout
import com.vaadin.server.VaadinRequest
import com.vaadin.annotations.Theme
import com.vaadin.ui.UI
import com.vaadin.ui.Label
import com.vaadin.ui.Button
import com.vaadin.ui.Button.ClickListener
import com.vaadin.ui.Button.ClickEvent
import com.vaadin.ui.Notification
import java.util.Date
import javax.servlet.Servlet
import javax.servlet.annotation.WebServlet
import com.vaadin.server.VaadinServlet
import com.vaadin.annotations.VaadinServletConfiguration

@Theme("mytheme")
class MainUI extends UI {
  
  override def init(request: VaadinRequest) = {
    val content: VerticalLayout = new VerticalLayout
    setContent(content)

    val label: Label = new Label("Hello, world!")
    content addComponent label

    // Handle user interaction
    content addComponent new Button("Click Me!",
      new ClickListener {
        override def buttonClick(event: ClickEvent) =
          Notification.show("The time is " + new Date)
      })
  }
}