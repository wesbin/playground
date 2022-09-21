<script setup>
import Board from '@/components/board/Board';

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
      <!-- todo relatedMenu? -->
      <Board :tabs="recentViewBoard"></Board>
    </section>
    <section class="board-section">
      <!-- todo Board 한줄과 두줄 ThumbnailPost 크기 처리 -->
      <Board :tabs="recentViewBoard"></Board>
      <Board :tabs="recentViewBoard"></Board>
    </section>
  </main>
</template>

<style scoped lang="scss">
.main {
  width: 1150px;

  .board-section {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(0, 1fr));
    gap: 30px;

    .article {
      height: 300px;
      background-color: bisque;
    }
  }
}
</style>