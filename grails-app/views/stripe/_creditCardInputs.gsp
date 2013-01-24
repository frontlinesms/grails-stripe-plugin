<div class="${cssClass}">
    <label for="stripe-card-number"><g:message code="stripe.form.cardNumber" default="Card Number"/></label>
    <input type="text" size="20" autocomplete="off" class="card-number" id="stripe-card-number"/>
</div>
<div class="${cssClass}">
    <label for="stripe-cvc"><g:message code="stripe.form.cvc" default="CVC"/></label>
    <input type="text" size="4" autocomplete="off" class="card-cvc"/>
</div>
<div class="${cssClass}">
    <label for="stripe-card-expiry-month"><g:message code="stripe.form.expiry" default="Expiry (MM/YYYY)"/></label>
    <input type="text" size="2" class="card-expiry-month" id="stripe-card-expiry-month"/>
    <span><g:message code="stripe.form.expiry.separator" default="/"/></span>
    <input type="text" size="4" class="card-expiry-year" id="stripe-card-expiry-year"/>
</div>

