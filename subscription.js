document.getElementById('subscriptionForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const email = document.getElementById('email').value;
    const industry = document.getElementById('industry').value;

    if (email && industry) {
        fetch('/api/subscribe', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email, industry })
        })
        .then(response => response.json())
        .then(data => {
            alert('Subscription successful!');
        })
        .catch(error => {
            console.error('Error:', error);
            alert('Subscription failed.');
        });
    } else {
        alert('Please fill in all fields.');
    }
});
