package com.lazday.kotlinanko

import android.support.v4.content.ContextCompat
import android.text.InputType
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainLayout : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {

        linearLayout {

            verticalLayout {

                val edtUser = editText {

                    hint = "Username"
                }

                val edtPass = editText {

                    inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_CLASS_TEXT
                    hint = "Password"
                }

                button("Login") {

                    backgroundColor = ContextCompat.getColor(context, R.color.colorPrimary)
                    textColor = ContextCompat.getColor(context, R.color.white)

                    onClick {

                        val username = edtUser.text.toString()
                        val password = edtPass.text.toString()

                        if (username == "admin" && password == "admin") {
                            alert("Login successfully.", "Nice!")
                                .show()
                        } else {
                            longToast("Wrong username or password")
                        }

                    }
                }.lparams{
                    width = matchParent
                    topMargin = dip(10)
                }

            }.lparams(width = matchParent) {
                margin = dip(16)

            }

        }
    }
}