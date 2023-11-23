const input_box = document.querySelector("#message-input");
const output_box = document.querySelector("#messages");


const clear_box = function () {
    input_box.value = "";
}

const send_message = () => {
    const message = input_box.value;

    if (message.length > 1)
    {
        let p = document.createElement("p");
        p.textContent = message;
        document.querySelector("#messages").appendChild(p);
    }

    let paragraphs = document.querySelectorAll("#messages p")
    paragraphs.forEach(function(paragraph) {
        paragraph.style.padding = "10px";
        paragraph.style.color = "#BA2D0B"
        // #003E1F color for the bot response
    });
}

document.addEventListener("DOMContentLoaded", () => {


    // Sending a message: either by pressing "enter" or clicking the send button
    document.querySelector("#send-button").onclick = () => {
        send_message();
        clear_box();
    }
    input_box.addEventListener('keydown', (event) => {
        if (event.key === "Enter")
        {
            send_message();
            clear_box();
        }
    })

    // New conversation:
    document.querySelector(".new_convo").onclick = () => {
        output_box.innerHTML = "";
    }

})

