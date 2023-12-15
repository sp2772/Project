from reportlab.pdfgen import canvas

def create_pdf_from_text_file(input_file, output_pdf):
    # Read data from the text file
    with open(input_file, 'r') as file:
        events_data = file.read()

    # Create a PDF document
    pdf_canvas = canvas.Canvas(output_pdf)

    # Set the font and font size
    pdf_canvas.setFont("Helvetica", 12)

    # Write the events data to the PDF
    pdf_canvas.drawString(72, 800, "Events Data:")
    pdf_canvas.drawString(72, 780, events_data)

    # Save the PDF file
    pdf_canvas.save()

# Example usage:
text_file_path = 'events_data.txt'  # Replace with the path to your text file
pdf_output_path = 'events_report.pdf'  # Replace with the desired output PDF file path

create_pdf_from_text_file(text_file_path, pdf_output_path)