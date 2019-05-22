package com.itvo.inittomvp.presenter

import com.itvo.inittomvp.repository.People
import com.itvo.inittomvp.view.PeopleView

class PeoplePresenter(val view : PeopleView) {

    fun checkPeopleInformation(people : People) {
        if (people.name.length > 6) {
            view.showError("El nombre es demasiado largo")
            return
        }

        if (people.lastName.length > 8) {
            view.showError("Los apellidos son demasiado largos")
            return
        }

        if (people.job.length > 10) {
            view.showError("La ocupación es demasiado larga")
            return
        }

        view.showPeopleInformation("Tu nombre es ${people.name} ${people.lastName}" +
             " y tu ocupación es ${people.job}")
    }


}