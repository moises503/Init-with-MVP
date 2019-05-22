package com.itvo.inittomvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.itvo.inittomvp.presenter.PeoplePresenter
import com.itvo.inittomvp.repository.People
import com.itvo.inittomvp.view.PeopleView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PeopleView {

    private val presenter : PeoplePresenter = PeoplePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAddUser.setOnClickListener {
            presenter.checkPeopleInformation(People(name = edtName.text.toString(),
                lastName = edtLastName.text.toString(),
                job = edtJob.text.toString()))
        }
    }

    override fun showPeopleInformation(info: String) {
        txtPeopleInformation.text = info
    }

    override fun showError(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }
}
