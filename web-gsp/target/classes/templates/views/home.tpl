layout 'layouts/main.tpl',
        pageTitle: 'Apartment Rule Manager',
        mainBody: contents {
   div(class:'jumbotron'){
     h1('Apartment Rule Manager')
       p(class:'lead','A new way to create and manage Apartment Rule.')
       span{
         a(class: 'btn btn-lg btn-success', href: '#', role: 'button', 'Get Rules')
       }
		span{
         a(class: 'btn btn-lg btn-success', href: '#', role: 'button', 'Create Rule')
       }
         span{
         a(class: 'btn btn-lg btn-success', href: '#', role: 'button', 'Delete Rule')
       }
   }


   div(class: 'row marketing'){
         offers.each { offer ->
            div(class: 'col-lg-6'){
                h4(offer.header)
                p(offer.description)
            }
        }
   }
}