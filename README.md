# Hadith - API - SpringBoot

> Simple Islamic Hadith API with Indonesia Translation.

[//]: # (## Deployed in: )

### Data Source
- [x] [tafsirq.com](https://tafsirq.com/hadits)
- [ ] Your contribution ?

### Available Hadith
- [x] Muslim
- [x] Bukhari
- [x] Tirmidzi
- [x] Nasai
- [x] Abu Daud
- [x] Ibnu Majah
- [x] Ahmad
- [x] Darimi
- [x] Malik
- [ ] Your contribution ?

### Features
- [x] Arabic 
- [x] Indonesia Translation
- [ ] Your contribution ?

### Endpoint usage
- [x] `/hadith-books` = Returns the list of available Hadith Books with number of Hadiths in each book.
- [x] `/hadith-books/book/{hadithBook}` = Returns hadiths in specific book **Example:[/hadith-books/book/bukhari]**
- [x] `/hadith-books/hadith/{hadithNumber}` = Returns hadiths by number from all books. **Example: [/hadith-books/book/7]**
- [x] `/hadith-books/hadith/{hadithBook}/{hadithNumber}` = Returns spesific hadith from specific book. **Example: [/hadith-books/muslim/5]**

[//]: # (### Example Response)

[//]: # (> Fetching on [Muslim No. 5]&#40;https://localhost/8080/hadith-books/hadith/muslim/5&#41;)

[//]: # ()
[//]: # ([![`/books/muslim/5`]&#40;https://raw.githubusercontent.com/sutanlab/hadith-api/master/screenshots/example-result.png&#41;]&#40;https://raw.githubusercontent.com/sutanlab/hadith-api/master/screenshots/example-result.png&#41;)

### Recommended Arabic Fonts 
- [quran.musil.com](http://quran.mursil.com/Web-Print-Publishing-Quran-Text-Graphics-Fonts-and-Downloads/fonts-optimized-for-quran)
- [Uthmani](https://groups.google.com/forum/#!topic/colteachers/Y6iKganK0tQ)

[//]: # (### Available Commands)

[//]: # (- `yarn start` = run server.)

[//]: # (- `yarn dev` = run develop server.)

[//]: # (- `yarn crawl` = collect new data from the data source, then unifying it in one JSON file.)

### LICENSE
MIT

[//]: # (## Support or Donate Me)

[//]: # ()
[//]: # (### Global)

[//]: # ([![ko-fi]&#40;https://www.ko-fi.com/img/githubbutton_sm.svg&#41;]&#40;https://ko-fi.com/B0B71P7PB&#41;)

[//]: # ()
[//]: # (### Indonesia)

[//]: # (- Bank Syariah Mandiri [REK: 7142365973 &#40;SUTAN GADING F NASUTION&#41;])

[//]: # (- [Trakteer]&#40;https://trakteer.id/sutanlab&#41;)

[//]: # (- [Karyakarsa]&#40;https://karyakarsa.com/sutanlab&#41;)

---
Copyright © 2022 for Spring Boot Editions by Yousef Ahmed Yousef

Copyright © 2020 for original project by Sutan Gading Fadhillah Nasution

