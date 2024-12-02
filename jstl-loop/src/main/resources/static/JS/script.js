function highlightFruits() {
    // Select all table rows
    const rows = document.querySelectorAll("tbody tr");

    rows.forEach(row => {
        // Get the fruit name from the first cell
        const fruitName = row.cells[0].textContent.trim();

        // Check if the name starts with "G" (case-sensitive)
        if (fruitName.startsWith("G")) {
            // Change the font color to orange
            row.cells[0].style.color = "orange";
        }
    });
}

// Run the highlightFruits function after the page loads
window.onload = highlightFruits;