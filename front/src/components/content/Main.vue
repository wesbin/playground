<script setup>
import Board from '@/components/content/board/Board';

const recentViewBoard = [
  {
    name: '만화',
    posts: [
      {
        title: 'A'
      },
      {
        title: 'B'
      },
      {
        title: 'C'
      },
      {
        title: 'D'
      },
      {
        title: 'E'
      },
      {
        title: 'F'
      },
      {
        title: 'G'
      },
      {
        title: 'H'
      },
      {
        title: 'I'
      },
      {
        title: 'J'
      },
    ],
  },
  {
    name: '음악',
    posts: [
      {
        title: '1'
      },
      {
        title: '2'
      },
      {
        title: '3'
      },
      {
        title: '4'
      },
      {
        title: '5'
      },
      {
        title: '6'
      },
      {
        title: '7'
      },
      {
        title: '8'
      },
      {
        title: '9'
      },
      {
        title: '0'
      },
    ]
  },
]
</script>

<template>
  <main class="main">
    <section class="board-section">
      <Board :tabs="recentViewBoard"></Board>
    </section>
    <section class="board-section">
      <article class="article">랜덤</article>
      <article class="article">등등</article>
    </section>
    <section class="board-section">
      <article class="article">원하는거</article>
      <article class="article">게시판</article>
      <article class="article">형식으로</article>
    </section>
  </main>
</template>

<style scoped lang="scss">
.main {
  width: 1150px;

  .board-section {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(0, 1fr));

    .article {
      height: 300px;
      background-color: bisque;
    }
  }
}
</style>