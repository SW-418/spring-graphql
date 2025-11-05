FROM python:3.13-slim

# Set work dir on container
WORKDIR /app

# Copy requirements over
COPY requirements.txt .

# Install requirements
RUN pip install -r requirements.txt

# Copy actual API
COPY artists-api.py .

# Set environment variables for Flask
ENV FLASK_APP=artists-api.py
ENV FLASK_RUN_HOST=0.0.0.0

# Run the application
CMD ["flask", "run"]
